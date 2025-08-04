package day12;

public class FoodMain {
    
    // 피자 포장 메소드
    public static void foodBoxing(Food f) {
    	
        System.out.println(p.name + "를 포장했습니다.");
        
        int takeOutPrice =0;
        
        if (f instanceof Pizza) {
        	takeOutPrice = 3000;
        }else if(f instanceof Burger) {
        	takeOutPrice = 2000;
        }else if( f instanceof Salad) {
        	takeOutPrice = 1000;
        }
        System.out.println(f.name + "의 포장비는" + takeOutPrice + "원 입니다.");
    }

    // 버거 포장 메소드
    public static void burgerBoxing(Burger b) {
        System.out.println(b.name + "를 포장했습니다.");
        System.out.println("버거는 포장비 1000원 입니다.");
    }

    // 샐러드 포장 메소드
    public static void burgerSalad(Salad s) {
        System.out.println(s.name + "를 포장했습니다.");
        System.out.println("셀러드는 포장비 3000원 입니다.");
    }

    
    
    public static void main(String[] args) {

        Pizza p = new Pizza("슈퍼슈프림피자");
        System.out.println(pizza.toString()); //pizza.toString();
        Food f = p;  // 업캐스팅
        foodBoxing(f);  // 변수 이름은 p

        Burger b = new Burger("햄부기버거");
        burgerBoxing(b);  // 변수 이름은 b

        Salad s = new Salad("리코타치즈셀러드");
        burgerSalad(s);  // 메소드 이름은 burgerSalad
        
        
        
        
    }
}
