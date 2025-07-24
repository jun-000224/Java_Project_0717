package day7;

class IPTV extends ColorTV {
    private String ip;

    public IPTV(String ip, int size, int color) {
        super(size, color); // ColorTV 생성자 호출
        this.ip = ip;
    }

    @Override
    public void printProperty() {
        System.out.println("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
    
    }

}
