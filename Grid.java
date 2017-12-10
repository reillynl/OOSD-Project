import java.util.ArrayList;

public class Grid
{
    ArrayList<NonEditableTextBlock> row0;
    ArrayList<NonEditableTextBlock> row1;
    ArrayList<NonEditableTextBlock> row2;
    ArrayList<NonEditableTextBlock> row3;
    ArrayList<NonEditableTextBlock> row4;
    ArrayList<NonEditableTextBlock> row5;
    ArrayList<NonEditableTextBlock> row6;
    ArrayList<NonEditableTextBlock> row7;
    ArrayList<NonEditableTextBlock> row8;
    ArrayList<NonEditableTextBlock> row9;
    ArrayList<NonEditableTextBlock> row10;
    ArrayList<NonEditableTextBlock> row11;
    ArrayList<NonEditableTextBlock> row12;
    ArrayList<NonEditableTextBlock> row13;
    ArrayList<NonEditableTextBlock> row14;
    public Grid(
               ArrayList<NonEditableTextBlock> row0,
               ArrayList<NonEditableTextBlock> row1,
               ArrayList<NonEditableTextBlock> row2,
               ArrayList<NonEditableTextBlock> row3,
               ArrayList<NonEditableTextBlock> row4,
               ArrayList<NonEditableTextBlock> row5,
               ArrayList<NonEditableTextBlock> row6,
               ArrayList<NonEditableTextBlock> row7,
               ArrayList<NonEditableTextBlock> row8,
               ArrayList<NonEditableTextBlock> row9,
               ArrayList<NonEditableTextBlock> row10,
               ArrayList<NonEditableTextBlock> row11,
               ArrayList<NonEditableTextBlock> row12,
               ArrayList<NonEditableTextBlock> row13,
               ArrayList<NonEditableTextBlock> row14
               )
    {
        ArrayList<ArrayList<NonEditableTextBlock>> igrid = new ArrayList<ArrayList<NonEditableTextBlock>>(15);
        int i;
        for (i=0; i<15; i++)
        {
            igrid.add(row+i);
        }
    }

    public NonEditableTextBlock getBlock(int posx, int posy)
    {
        ArrayList temp = igrid.get(posy);
        return temp.get(posx);
    }
    
    public void replaceBlock(NonEditableTextBlock b, int posx, int posy)
    {
        ArrayList temp = igrid.get(posy);
        temp.set(posx, b);
        igrid.set(posy, temp);
    }

    private ArrayList igrid;
}

