package com.mj;

public class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	// TODO:6
	/*
	 * 此方法为对象销毁之前最后调用的方法
	 */
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		
		System.out.println("Person - finalize");
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO:9
		/*
		 * 泛型数组中可能添加任何类型，所以要判断是否为同一类型，否则强制转换会报错。
		 */
		if (obj == null) return false;
		if (obj instanceof Person) {
			Person person  = (Person) obj;
			return this.age == person.age;
		}
		return false;
	}
}
