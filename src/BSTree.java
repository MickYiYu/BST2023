public class BSTree <T extends Comparable<T>> {
    private BSTNode<T> root;

    public BSTree(){
        root=null;
    }

    public void add(T data){
        if(root==null){
            root = new BSTNode<>(data);
        }
        else addRecur(root,data);

        addRecur(root,data);
    }

    private void addRecur(BSTNode<T> root, T data){
        //if the data is less than the root
        if(data.compareTo(root.getData())<0){
            if(root.getLeft()==null){//left does not exist
                root.setLeft(new BSTNode<>(data));
            }
            else {//left exists, re
                addRecur(root.getLeft(),data);
            }
        }
        else {//the data is greater than the root
            if(root.getRight()==null){
                root.setRight(new BSTNode<>(data));
            }
            else {
                addRecur(root.getRight(),data);
            }
        }

    }

    public void PrintInOrder(){
        PrintInOrderRecur(root);
    }

    public void delete(T data){
        if(root==null){
            root = new BSTNode<>(data);
        }
        else deleteRecur(root,data);

        deleteRecur(root,data);
    }

    public void deleteRecur(BSTNode<T>root,T data){
            if(data.compareTo(root.getData())<0) {//data less than root
                if (root.getLeft().equals(data)) {
                    root.setLeft(root.getLeft().getLeft());

                } else {
                    deleteRecur(root.getLeft(), data);
                }
            }

            else {
                if (root.getRight().equals(data)) {
                    root.setRight(root.getRight().getRight());
                } else {
                    deleteRecur(root.getRight(), data);
                }
            }


    }

    public boolean exist(T data){
        if(data.equals(root.getData())){
            return true;
        }
        return false;
    }

    public void PrintInOrderRecur(BSTNode<T> Node){
        if(Node==null){
            return;
        }

        PrintInOrderRecur(Node.getLeft());
        System.out.print(Node + ",");
        PrintInOrderRecur(Node.getRight());
    }

}
