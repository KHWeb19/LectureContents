class CascadeTest {
  String name;

  CascadeTest(this.name);

  void cascadeTest() {
    print("요런식으로 작업이 가능해서 편리함. 자바 왜 씀 ?");
  }
  void cascadeTest2() {
    print("이래서 잘나가는 기업들이 자바를 안씁니다.");
  }
  /*
  ......
  ......
   */
}

cascade_grammar_test() {
  CascadeTest cascadeTest = CascadeTest("아무개")..cascadeTest()..cascadeTest2();
  // cascadeTest.cascadeTest1();
  // cascadeTest.cascadeTest2();
  // cascadeTest.cascadeTest3();
  // cascadeTest.cascadeTest4();
  // cascadeTest.cascadeTest5();

  print("이름: ${cascadeTest.name}");
}