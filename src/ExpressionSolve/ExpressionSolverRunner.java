/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ExpressionSolve;

/**
 *
 * @author Josh Baird
 */
public class ExpressionSolverRunner {

    public static void main(String[] args) {
        ExpressionSolver.solve("3+5");
        ExpressionSolver.solve("3*5");
        ExpressionSolver.solve("3-5");
        ExpressionSolver.solve("3/5");
        ExpressionSolver.solve("5/5*2+8/2+5");
        ExpressionSolver.solve("5*5+2/2-8+5*5-2");
    }
}
