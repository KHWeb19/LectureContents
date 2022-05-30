null_replace_test() {
  Null username = null;

  print(username);
  print(username ?? "아무개");
}