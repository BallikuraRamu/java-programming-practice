package inner_classes;

public class NonStaticMembersInNonStaticInnerClass {

	void m1() {
		System.out.println("Outer class : Non static outer method");
	}

	public class Inner {
		void m2() {
			System.out.println("Inner class : Non static inner method");
		}
	}

	public static void main(String[] args) {
		NonStaticMembersInNonStaticInnerClass nsm = new NonStaticMembersInNonStaticInnerClass();
		nsm.m1();
		NonStaticMembersInNonStaticInnerClass.Inner obj = nsm.new Inner();
		obj.m2();
	}
}
