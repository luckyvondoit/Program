package com.mj;


public class Main {

	public static void main(String[] args) {
		ArrayList<Object> list  = new ArrayList<>();
		list.add(10);
		list.add(new Person(10, "Jack"));
		list.add(22);
		
		list.indexOf(new Person(10, "Jack"));
		// TODO:3
		//测试代码，除了一次次修改边界值，再运行，也可以通过提前写一些边界情况，运行后看边界的情况是否符合预期。通过asserts类
		
//		ArrayList<Object> persons  = new ArrayList<>();
//		persons.add(new Person(10, "Jack"));
//		persons.add(null);
//		persons.add(new Person(15, "Rose"));
//		persons.add(null);
//		persons.add(new Person(12, "James"));
//		persons.add(null);
//
//		System.out.println(persons.indexOf(null));
		
		// TODO:7
		/*
		 * java内存回收不是及时的，在某个时间点统一清理
		 * 如何想立即清理，需要提醒JVM进行垃圾回收，需要主动调用以下函数
		 * System.gc();
		 */
		
//		ArrayList<Object> list  = new ArrayList<>();
//		list.add(new Person(10, "Jack"));
//		list.add(new Person(10, "Roce"));
//		list.clear();
//		System.gc();//通过注释这行代码查看效果
	}

	static void test() {
		// TODO:1
		// java 泛型只能放对象
		// int -> Integer
	
		// 所有的类，最终都继承java.lang.Object

		// new是向堆空间申请内存
		// TODO:2
//		ArrayList<Person> persons  = new ArrayList<Person>();//后面泛型Person可以省略，声明的时候必须写完整
		ArrayList<Person> persons  = new ArrayList<>();
		persons.add(new Person(10, "Jack"));
		persons.add(new Person(12, "James"));
		persons.add(new Person(15, "Rose"));
		persons.clear();
		persons.add(new Person(22, "abc"));
		
		System.out.println(persons);
		ArrayList<Integer> ints  = new ArrayList<>();
		ints.add(10);
		ints.add(10);
		ints.add(22);
		ints.add(33);
		System.out.println(ints);
	}
}
