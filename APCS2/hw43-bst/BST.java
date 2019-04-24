//Qian Zhou
//APCS2 pd01
//HW43 -- BSTs is the Perfect Place for Shade that¡¯s just how I feel
//2018-05-01
/*****************************************************
 * class BST - v1:partial
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 * This BST only holds ints (its nodes have int cargo)
 *****************************************************/

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /*****************************************************
   * default constructor
   *****************************************************/
  BST( )
  {
    _root = null;
  }


  /*****************************************************
   * void insert( int )
   * Adds a new data element to tree.
   *****************************************************/
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
      return;
    }
    insert( _root, newNode );
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( newNode.getValue() < stRoot.getValue() ) {
      //if no left child, make newNode the left child
      if ( stRoot.getLeft() == null )
        stRoot.setLeft( newNode );
      else //recurse down left subtree
        insert( stRoot.getLeft(), newNode );
      return;
    }
    else { // new val >= curr, so look down right subtree
      //if no right child, make newNode the right child
      if ( stRoot.getRight() == null )
        stRoot.setRight( newNode );
      else //recurse down right subtree
        insert( stRoot.getRight(), newNode );
      return;
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if ( currNode == null ) //stepped beyond leaf
      return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if ( currNode == null ) //stepped beyond leaf
      return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if ( currNode == null ) //stepped beyond leaf
      return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //methinks as recursion is repeatedly mentioned, but no helper method given, looping maight be ze answer for search

    
    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
	if (_root==null)return null;
	TreeNode cloud = _root;
	while (cloud!=null){
	    if (cloud.getValue()==target)return cloud;
	    if (target<cloud.getValue()){
		cloud = cloud.getLeft();
	    }
	    else cloud = cloud.getRight();
	}
	return null;
	
    }


    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 0
     *****************************************************/
    public int height()
    {
	if (_root ==null){return -1;};
	return height(_root,0);
    }

    //helper ...I think is needed
    public int height(TreeNode n, int h){
	if (n==null){return 0;}
	if(n.getLeft()==n.getRight()){//null, since BST can't have same vals
	    return h;}
	h++;
	return Math.max(height(n.getLeft(),h), height(n.getRight(),h));
    }

    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
	return numLeaves(_root);
    }

    //can think of no way of traversing w/o helper, nor some mathematical method of solving based on traversals
    public int numLeaves(TreeNode n){
	if (n==null){
	    return 0;}
	else if(n.getLeft()==n.getRight()){//null, since BST can't have same vals
	    return 1;}
	else return numLeaves(n.getLeft())+numLeaves(n.getRight());
	
	
    }



  //main method for testing
  public static void main( String[] args )
  {
    BST arbol = new BST();

    //PROTIP: sketch state of tree after each insertion
    //        ...BEFORE executing these.
    arbol.insert( 4 );
    arbol.insert( 2 );
    arbol.insert( 5 );
    arbol.insert( 6 );
    arbol.insert( 1 );
    arbol.insert( 3 );

    System.out.println( "\n-----------------------------");
    System.out.println( "pre-order traversal:" );
    arbol.preOrderTrav();

    System.out.println( "\n-----------------------------");
    System.out.println( "in-order traversal:" );
    arbol.inOrderTrav();
 
    System.out.println( "\n-----------------------------");
    System.out.println( "post-order traversal:" );
    arbol.postOrderTrav();

    System.out.println( "\n-----------------------------");
    
    System.out.println("testing, please be quiet");
    System.out.println(arbol.search(1).getValue());
    System.out.println(arbol.search(2).getValue());
    System.out.println(arbol.search(3).getValue());
    System.out.println(arbol.search(4).getValue());
    System.out.println(arbol.search(5).getValue());
    System.out.println(arbol.search(6));
    
    System.out.println(arbol.search(7));

   
    System.out.println(arbol.numLeaves());
    System.out.println(arbol.height());
    arbol.insert( 0 );
    arbol.insert( -1 );
    arbol.insert( -4 );
    arbol.insert( -5 );
    arbol.insert( 7 );
    arbol.insert( 10 );
    arbol.insert( 100 );
    arbol.insert( 101 );
    arbol.insert( -3 );
    System.out.println(arbol.numLeaves());
    System.out.println(arbol.height());
    
	
  }

}//end class
