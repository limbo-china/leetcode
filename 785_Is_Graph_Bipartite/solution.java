private static class Solution {
		public boolean isBipartite(Integer[][] graph) {
			int[] colors = new int[graph.length];
			Arrays.fill(colors, -1);

			// This graph might be a disconnected graph. So check each
			// unvisited node.
			for (int i = 0; i < graph.length; i++)
				if (colors[i] == -1 && !validColor(graph, colors, 0, i))
					return false;
			return true;
		}

		public boolean validColor(Integer[][] graph, int[] colors, int color,
				int node) {
			if (colors[node] != -1)
				return colors[node] == color;
			colors[node] = color;
			for (int next : graph[node])
				if (!validColor(graph, colors, 1 - color, next))
					return false;
			return true;
		}
}