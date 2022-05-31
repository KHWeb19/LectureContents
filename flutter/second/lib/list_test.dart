list_test () {
  List<int> nums = [1, 2, 3, 4];

  print(nums[0]);
  print(nums[1]);
  print(nums[2]);
  print(nums[3]);

  return nums;
}

list_add_test (listRef) {
  listRef.add(33);
  listRef.add(77);
}

list_rm_test (listRef) {
  listRef.removeAt(1);
}