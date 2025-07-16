package model;

import java.util.Collection;
import java.util.List;
import static java.util.Objects.nonNull;
import static java.util.Objects.isNull;

import static model.GameStatusEnum.COMPLETE;
import static model.GameStatusEnum.INCOMPLETE;
import static model.GameStatusEnum.NON_STARTED;

public class Board {
    private final List<List<Space>> spaces;

    public Board(final List<List<Space>> spaces) {
        this.spaces = spaces;
    }

    public List<List<Space>> getSpaces() {
        return spaces;
    }

    
    public GameStatusEnum getStatus(){
        if (spaces.stream().noneMatch(s -> !((Space) s).isFixed() && nonNull(((Space) s).getActual()))){
            return NON_STARTED;
        }

        return spaces.stream().anyMatch(s -> isNull(((Space) s).getActual())) ? INCOMPLETE : COMPLETE;
    }

    public boolean hasErros(){
        if(getStatus() == NON_STARTED){
            return false;
        }

        return spaces.stream()
        .anyMatch(s -> nonNull(((Space) s).getActual()) && !((Space) s).getActual().equals(((Space) s).getExpected()));
    }

    public boolean changeValue(final int col, final int row, final int value){
        Space space = spaces.get(col).get(row);

        if(space.isFixed()){
            return false;
        }

        space.setActual(value);
        return true;
    }

    public boolean clearValue(final int col, final int row){
        Space space = spaces.get(col).get(row);

        if(space.isFixed()){
            return false;
        }

        space.clearSpace();
        return true;

    }

    public void reset(){
        spaces.forEach(list -> list.forEach(Space::clearSpace));
    }

    public boolean gameIsFinish(){
        return !hasErros() && getStatus() == COMPLETE;
    }







    

}
