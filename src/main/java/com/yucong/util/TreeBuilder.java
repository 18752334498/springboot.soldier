package com.yucong.util;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import lombok.Data;

public class TreeBuilder {
    List<TreeBuilder.Node> nodes = new ArrayList<TreeBuilder.Node>();
    public TreeBuilder(List<Node> nodes) {
        super();
        this.nodes = nodes;
    }

    /**
     * <li>构建JSON树形结构</li>
     */
    public String buildJSONTree() {
        List<Node> nodeTree = buildTree();
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(nodeTree));
        return jsonArray.toString();
    }

    /**
     * <li>构建树形结构</li>
     */
    public List<Node> buildTree() {
        List<Node> treeNodes = new ArrayList<Node>();
        List<Node> rootNodes = getRootNodes();
        for (Node rootNode : rootNodes) {
            buildChildNodes(rootNode);
            treeNodes.add(rootNode);
        }
        return treeNodes;
    }

    /**
     * <li>递归子节点</li>
     */
    public void buildChildNodes(Node node) {
        List<Node> children = getChildNodes(node);
        if (!children.isEmpty()) {
            for (Node child : children) {
                buildChildNodes(child);
            }
            node.setChild(children);
        }
    }

    /**
     * <li>获取父节点下所有的子节点</li>
     */
    public List<Node> getChildNodes(Node pnode) {
        List<Node> childNodes = new ArrayList<Node>();
        for (Node n : nodes) {
            if (pnode.getValue().equals(n.getPid())) {
                childNodes.add(n);
            }
        }
        return childNodes;
    }

    /**
     * <li>判断是否为根节点</li>
     */
    public boolean rootNode(Node node) {
        boolean isRootNode = true;
        for (Node n : nodes) {
            if (node.getPid().equals(n.getValue())) {
                isRootNode = false;
                break;
            }
        }
        return isRootNode;
    }

    /**
     * <li>获取集合中所有的根节点</li>
     */
    public List<Node> getRootNodes() {
        List<Node> rootNodes = new ArrayList<Node>();
        for (Node n : nodes) {
            if (rootNode(n)) {
                rootNodes.add(n);
            }
        }
        return rootNodes;
    }

    @Data
    public static class Node {
        private String value;// valued
        private String pid;
        private String label;// label
        private List<Node> child;// child

        public Node() {}

        public Node(String value, String pid, String label) {
            super();
            this.value = value;
            this.pid = pid;
            this.label = label;
        }

    }

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<Node>();

        Node p1 = new Node("1", "", "山东省");
        Node p6 = new Node("101", "1", "济南");
        Node p7 = new Node("102", "1", "日照");
        Node p2 = new Node("10101", "101", "历下区");
        Node p3 = new Node("10102", "101", "天桥区");
        Node p4 = new Node("2", "", "江苏省");

        nodes.add(p1);
        nodes.add(p2);
        nodes.add(p3);
        nodes.add(p4);
        nodes.add(p6);
        nodes.add(p7);

        TreeBuilder treeBuilder = new TreeBuilder(nodes);
        System.out.println(treeBuilder.buildJSONTree());
    }

}
