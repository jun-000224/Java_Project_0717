package BackUp;

public class ForMethod {
	
	// 과일 이름으로 해시맵 찾기
	HashMap<String, Object> fruit = null;
	for (int i = 0; i < list.size(); i++) {
	    HashMap<String, Object> getFruit = list.get(i);
	    if (getFruit.get("fruitName").equals(fruitName)) {
	        fruit = getFruit;
	        break;
	    }
	}

	
	
	public static HashMap<String, Object> findFruit(ArrayList<HashMap<String, Object>> list, String name) {
	    for (HashMap<String, Object> fruit : list) {
	        if (fruit.get("fruitName").equals(name)) {
	            return fruit;
	        }
	    }
	    return null;
	}

	
	
	
	HashMap<String, Object> fruit = findFruit(list, fruitName); //호출은 이런식
	
	
	
	//최종 사용 예시
	if (menu == 2) {
	    System.out.print("검색할 과일명 : ");
	    String fruitName = s.next();

	    HashMap<String, Object> fruit = findFruit(list, fruitName);

	    if (fruit == null) {
	        System.out.println("해당 과일이 존재하지 않습니다.");
	    } else {
	        System.out.print("가격 : " + fruit.get("price") + "원, ");
	        System.out.println("개수 : " + fruit.get("count") + "개");
	    }
	}



}
