/**
 * MultiStageGraph
 *
 * @author Sid
 * @version 1.0
 */
import java.util.*;
import java.io.*;
class multistage
{

    //static int N;
    static int graph[][] = new int[50][50];
    static int INF = 9999;
    static int n;

    // Returns shortest distance from 0 to N-1.
    public static int shortestDist(int graph[][], int N)
    {

        // dist[i] is going to store shortest distance from node i to node N-1.
        int dist[] = new int[N];

        dist[N - 1] = 0;

        // Calculating shortest path for rest of the nodes
        for (int i = N - 2; i >= 0; i--)
        {

            // Initialize distance from i to destination (N-1)
            dist[i] = INF;

            // Check all nodes of next stages to find shortest distance from i to N-1.
            for (int j = i; j < N; j++)
            {
                // Reject if no edge exists
                if (graph[i][j] == 0 && graph[j][i] == 0)
                    continue;

                // We apply recursive equation to find distance to target through j, and compare with minimum distance so far.
                dist[i] = Math.min(dist[i], graph[i][j]+ dist[j]);
            }
        }

        return dist[0];
    }    

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("File:");
        String file = read.nextLine();
        try
        {
            System.out.println("Enter the number of vertices in the graph:");
            n = read.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("NOT A VALID INTEGER");
            System.exit(0);
        }

        try
        {
            Scanner input = new Scanner (new File(file));
            System.out.println("Graph :");
            while (input.hasNextInt()!=false)
            {
                for (int i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        graph[i][j]= input.nextInt();
                        graph[j][i] = graph[i][j];
                        System.out.print(graph[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
        System.out.println("THE SHORTEST DISTANCE = "+shortestDist(graph, n));
    }
}
