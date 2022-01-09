import java.util.*;

public class DFS {
    private Stack<Node> stack;
    static class Node
    {
        int data;
        boolean visited;
        List<Node> neighbours;

        Node(int data)
        {
            this.data=data;
            this.neighbours=new ArrayList<>();

        }
        public void addNeighbours(Node neighbourNode)
        {
            this.neighbours.add(neighbourNode);
        }
        public List<Node> getNeighbours() {
            return neighbours;
        }
    }

    public DFS()
    {
        stack = new Stack<Node>();
    }

    public void dfs(Node node)
    {
        stack.push(node);
        node.visited=true;
        while (!stack.isEmpty())
        {

            Node element=stack.pop();
            System.out.print(element.data + "\t");
            List<Node> neighbours=element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    stack.push(n);
                    n.visited=true;

                }
            }

        }
    }

    public static void main(String arg[])
    {

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addNeighbours(node10);
        node40.addNeighbours(node20);
        node10.addNeighbours(node30);
        node10.addNeighbours(node60);
        node20.addNeighbours(node50);
        node20.addNeighbours(node70);
        System.out.println("The DFS traversal of the graph is ");
        DFS dfsExample = new DFS();
        dfsExample.dfs(node40);

    }
}
