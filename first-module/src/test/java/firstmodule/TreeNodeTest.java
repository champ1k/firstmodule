package firstmodule;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {
    TreeNode tree;
    @BeforeEach
    void setUp()
    {
        tree = new TreeNode(5);
        tree.insert(new TreeNode(10));
        tree.insert(new TreeNode(6));
        tree.insert(new TreeNode(2));
        tree.insert(new TreeNode(3));
        tree.insert(new TreeNode(8));
        tree.insert(new TreeNode(9));
    }
    @Test
    void getHeight() {
        test(5,tree.getHeight(tree));
    }
    private void test(int expected,int actual)
    {
        assertEquals(expected,actual);
    }
}
