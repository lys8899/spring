package testA;

/**
 * @description:
 * @author: LiYongSen[825760990@qq.com]
 * @create: 2019-03-06 17:20
 **/
public class ClassA implements FindA {
    FindA findA;

    public void find1() {
    }

    public ClassA() {
        this.findA = this;
    }

    public FindA getFindA() {
        return findA;
    }

    public void setFindA(FindA findA) {
        this.findA = findA;
    }

    public static void main(String[] args) {
        FindA findA = new ClassA();
        FindA findA1 = ((ClassA) findA).getFindA();
        System.out.println(findA1==findA);
    }
}
