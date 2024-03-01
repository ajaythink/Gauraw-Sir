interface BasicTree {
	void grow();

	void produceFruit();
}

interface LeafShed extends BasicTree {
	void shedLeaves();
}

class MangoTree implements LeafShed {
	public void grow() {
		System.out.println("Mango Tree is growing..");
	}

	public void produceFruit() {
		System.out.println("Mango Tree is producing fruits..");
	}

	public void shedLeaves() {
		System.out.println("Mango Tree is shedding leaves..");
	}
}

class InterFace_2 {
	public static void main(String[] args) {
		MangoTree obj1 = new MangoTree();
		obj1.grow();
		obj1.produceFruit();
		obj1.shedLeaves();
	}
}