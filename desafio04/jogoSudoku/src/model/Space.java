package model;

public class Space {
    private Integer actual;
    private final int expected;
    private final boolean fixed;

    public Space(final int expected, final boolean fixed){
        this.expected = expected;
        this.fixed = fixed;
        if(fixed){
            actual = expected;
        }
    }

    public Integer getActual() {
        return actual;
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setActual(final Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    public void clearSpace(){
        setActual(null);
    }

    public Object stream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }

    public Space get(int row) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    public Object forEach(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forEach'");
    }

    


}
