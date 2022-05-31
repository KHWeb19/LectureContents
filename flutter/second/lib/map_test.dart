map_test () {
  Map map = { 1: 'one', 2: 'two' };
  map[3] = 'three';

  print(map);

  return map;
}

map_add_test (mapRef) {
  var associatedKey = mapRef.putIfAbsent(3, () => 'THREE');
  print(mapRef);
  print(associatedKey);

  mapRef.putIfAbsent(4, () => 'FOUR');
  print(mapRef);
}

map_addAll_test (mapRef) {
  mapRef.addAll({ 7: 'Seven', 8: '에이트', 9: '나인테일' });
  print(mapRef);
}

map_findByValue_test (mapRef) {
  var key = mapRef.keys.firstWhere((k) => mapRef[k] == 'Seven', orElse: () => null);
  print(key);
}

map_updateByKey_test (mapRef) {
  mapRef.update(3, (value) {
    print('업데이트 이전의 값: ' + value);
    return "변.경";
  });

  print(mapRef);
}