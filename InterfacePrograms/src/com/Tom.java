package com;

class Tom implements Employee {
	@Override
	public void work() {
		System.out.println("Working");
	}

	public static void main(String[] args) {
		System.out.println("Id: "+Employee.id);

		Tom t = new Tom();
		t.work();
	}

}
