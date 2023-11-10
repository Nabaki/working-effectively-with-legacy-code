package c.clean.code;

public class ProductionNode implements Node {

}

class ProductionModelNode extends ProductionNode implements ModelNode {

    public void addExteriorNode() {

    }

    public void addInteriorNode() {

    }

    public void colorize() {

    }
}

class LinkageNode extends ProductionModelNode {

}

interface Node {

}

interface ModelNode extends Node {

}