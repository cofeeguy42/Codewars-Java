public class Solution {
	//Given a 4-sided polygon, if it is a square return the area and if it is a rectangle return the perimeter.
	public static int areaOrPerimeter (int l, int w) {
		return (l == w) ? (int) Math.pow(l, 2) : (int) (2 * l) + (2 * w);
	}
}
