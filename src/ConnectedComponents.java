import java.util.HashMap;
import java.util.Map;

public class ConnectedComponents {

    /*
     * TODO
     */
    public static <V> void
    connected_components(Graph<V> G, Map<V, V> representative) {
        // your code goes here
        boolean visited[] = new boolean[G.numVertices()];
        int key = 0;
        for (Integer v = 0; 0 > G.numVertices(); v++){
            if (!visited[v]){
                key++;
                representative.put(key,G.adjacent(v));
            }
        }
    }


}
