package lab5.b_tree;

import java.util.LinkedList;
import java.util.List;

public class BTreeNode<K extends Comparable<K>, V> implements IBTreeNode<K, V> {

    private int numOfKeys;
    private boolean isLeaf;
    private List<K> keys;
    private List<V> values;
    private List<IBTreeNode<K, V>> children;

    public BTreeNode() {
        this.numOfKeys = -1;
        this.isLeaf = false;
        this.keys = new LinkedList<>();
        this.values = new LinkedList<>();
        this.children = new LinkedList<>();
    }

    @Override
    public int getNumOfKeys() {
        return keys.size();
    }

    @Override
    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    @Override
    public boolean isLeaf() {
        return isLeaf;
    }

    @Override
    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    @Override
    public List<K> getKeys() {
        return keys;
    }

    @Override
    public void setKeys(List<K> keys) {
        this.keys = keys;
    }

    @Override
    public List<V> getValues() {
        return values;
    }

    @Override
    public void setValues(List<V> values) {
        this.values = values;
    }

    @Override
    public List<IBTreeNode<K, V>> getChildren() {
        return children;
    }

    @Override
    public void setChildren(List<IBTreeNode<K, V>> children) {
        this.children = children;
    }
}
