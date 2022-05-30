vartypefunc_test() {
  int n1 = 1;
  double d1 = 10.1;
  bool b1 = true;
  String s1 = "아무개";

  print("정수: ${n1.runtimeType}");
  print("실수: ${d1.runtimeType}");
  print("불: ${b1.runtimeType}");
  print("문자열: ${s1.runtimeType}");
}