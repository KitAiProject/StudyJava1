public class Main {
    public Main(){//Mainのコンストラクタ
       SubClass[] objectArray = new SubClass[10];
        for(int i=0;i<5;i++) {
            objectArray[i] = new SubClass();//objectArrayにインスタンスを生成
        }
        for(int i=5;i<10;i++){
            objectArray[i] = new SubClass(i);
        }

        for(int i=0;i<10;i++){
            int rtn;
            rtn=objectArray[i].method(i*10);//それぞれのオブジェクトのメソッドを呼び出し
            System.out.println("rtn:"+rtn);
        }
    }

    public static void main(String[] args) {
        new Main();//Mainオブジェクト生成
    }
}
