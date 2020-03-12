package com.liulin.homework.w2020.w03.w07;

import com.liulin.study.designpatterns.i_compositemode.demo.safe.Directrory;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by DbL on 2020/3/12
 */
public class ParentNode extends Node {
    private List<Node> nodes;
    private Integer level;

    public ParentNode(String name, Integer level) {
        super(name);
        this.nodes = new ArrayList<Node>();
        this.level = level;
    }

    @Override
    public void show() {
        System.out.println(this.xpath);
        for (Node d : nodes) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("     ");
                }
                for (int i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
                d.show();
            }
        }
    }

    public boolean addChild(Node childNode) {
        childNode.xpath = this.xpath+"/"+childNode.name;
        return this.nodes.add(childNode);
    }
}
