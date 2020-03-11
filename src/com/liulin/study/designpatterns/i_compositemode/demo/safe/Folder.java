package com.liulin.study.designpatterns.i_compositemode.demo.safe;

import com.liulin.study.designpatterns.i_compositemode.demo.transparent.CourseComponet;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by DbL on 2020/3/11
 */
public class Folder extends Directrory {
    private List<Directrory> dirs;
    private Integer level;

    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<Directrory>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Directrory d : dirs) {
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

    public boolean add(Directrory directrory) {
        return this.dirs.add(directrory);
    }

    public boolean remove(Directrory directrory) {
        return this.dirs.remove(directrory);
    }

    public Directrory get(int index) {
        return this.dirs.get(index);
    }

    public void list() {
        for (Directrory dir : dirs) {
            System.out.println(dir.name);
        }
    }
}
