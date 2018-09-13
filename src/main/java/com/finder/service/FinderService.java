package com.finder.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

import org.springframework.stereotype.Component;

/**
 * FinderService contains common operations to performs searches over matrix
 * values to find the celebrity
 * 
 * @version 0.1
 * @author holmer.gaitan
 */
@Component
public class FinderService {

	/**
	 * Builds the matrix content based on a string that contains the boolean values
	 * associated to each people. <br>
	 * 
	 * For example: <br>
	 * if we have A, B and C people and B is the celebrity, the string content will
	 * be: 010000010<br>
	 * 
	 * The matrix created is the different combination values between A,B and C,
	 * like this:
	 *       [ 0(A) ] [ 1(B) ] [ 2(C) ]
	 * [0(A)][   0  ] [   1  ] [   0  ]
	 * [1(B)][   0  ] [   0  ] [   0  ]
	 * [2(C)][   0  ] [	  1  ] [   0  ]
	 * 
	 * @param size the matrix size, it will be a square matrix.
	 * @param content, string with matrix content
	 * @return a new matrix
	 */
	public Integer[][] buildMatrixContent(final Integer size, final String content) {

		final Integer[][] matrixContent = new Integer[size][size];
		final LinkedList<String> list = new LinkedList<>(Arrays.asList(content.split("")));

		for (Integer i = 0; i < size; i++) {

			for (Integer j = 0; j < size; j++) {

				matrixContent[i][j] = Integer.valueOf(list.pollFirst());
			}
		}

		return matrixContent;

	}

	/**
	 * Finds the celebrity based on a matrix with different combination values
	 * between each people, indicating if person X knows person Y. If X knows Y,
	 * there will be a 1 value in the matrix cell, if not, there will be a 0 value.
	 *
	 * Each person id is stored in a stack, that will be used to find the celebrity,
	 * based on this: <br>
	 * 
	 * If person 0 knows person 1, person 1 will be stored in the stack, and person
	 * 0 will be deleted. <br>
	 * If person 0 does not know person 1, person 0 will be stored in the stack, and
	 * person 1 will be deleted.
	 * 
	 * At the end, the celebrity may be stored in the stack
	 * 
	 * @param size matrix size
	 * @param matrix with all combinations
	 * @return id of celebrity found
	 */
	public Integer findCelebrity(final Integer size, final Integer[][] matrix) {

		final Stack<Integer> identifications = new Stack<>();
		for (Integer i = 0; i < size; i++) {

			identifications.push(i);
		}

		while (identifications.size() > 1) {

			final Integer firstSubject = identifications.pop();
			final Integer secondSubject = identifications.pop();

			if (matrix[firstSubject][secondSubject] == 1) {

				identifications.push(secondSubject);
			} else {

				identifications.push(firstSubject);
			}
		}

		return identifications.pop();
	}
}
