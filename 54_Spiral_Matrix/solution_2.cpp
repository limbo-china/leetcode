void spiral_architect(int** matrix, int r, int c, int mr, int mc, int *a)
{
    int i;

    /* End recursion */
    if (c > mc || r > mr)
        return;

    for (i = c; i <= mc; ++i, ++a) // Extract first row
        *a = *(matrix[r] + i);

    for (i = r + 1; i <= mr; ++i, ++a) // Extract last column
        *a = *(matrix[i] + mc);

    for (i = mc - 1; i >= c && r < mr; --i, ++a) // Last row */
        *a = *(matrix[mr] + i);

    for (i = mr - 1; i > r && c < mc; --i, ++a) // And then 1st column
        *a = *(matrix[i] + c);

    /* Turn to the inner sub-matrix */
    spiral_architect(matrix, r + 1, c + 1, mr - 1, mc - 1, a);
}
