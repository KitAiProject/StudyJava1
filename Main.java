public class Main {
    public Main(){//Main�̃R���X�g���N�^
       SubClass[] objectArray = new SubClass[10];
        for(int i=0;i<5;i++) {
            objectArray[i] = new SubClass();//objectArray�ɃC���X�^���X�𐶐�
        }
        for(int i=5;i<10;i++){
            objectArray[i] = new SubClass(i);
        }

        for(int i=0;i<10;i++){
            int rtn;
            rtn=objectArray[i].method(i*10);//���ꂼ��̃I�u�W�F�N�g�̃��\�b�h���Ăяo��
            System.out.println("rtn:"+rtn);
        }
    }

    public static void main(String[] args) {
        new Main();//Main�I�u�W�F�N�g����
    }
}
