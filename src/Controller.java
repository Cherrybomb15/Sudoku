import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.InputMethodEvent;

public class Controller
{
    @FXML
    private Button solve;

    @FXML
    private Button clear;

    @FXML
    private TextField box0, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14, box15, box16, box17, box18, box19, box20, box21, box22, box23, box24, box25, box26, box27, box28, box29, box30, box31, box32, box33, box34, box35, box36, box37, box38, box39, box40, box41, box42, box43, box44, box45, box46, box47, box48, box49, box50, box51, box52, box53, box54, box55, box56, box57, box58, box59, box60, box61, box62, box63, box64, box65, box66, box67, box68, box69, box70, box71, box72, box73, box74, box75, box76, box77, box78, box79, box80;
    //Used BoxMaker.py I didn't write this all out...

    public byte[][] board;

    private TextField[][] box;

    private final byte boardDim = 9;


    @FXML
    private void solveClicked(MouseEvent event)
    {

    }

    @FXML
    private void clearClicked(MouseEvent event)
    {
        for (TextField[] a : box)
        {
            for (TextField b : a)
            {
                b.setText("");
            }
        }
    }

    @FXML
    public void textChanged(InputMethodEvent event)
    {
        System.out.println(event.getSource().toString());
    }


    public void initialize()
    {
        box = new TextField[boardDim][boardDim];
        //Array of boxes to make operations easier

        box[0][0] = box0; box[1][0] = box1; box[2][0] = box2; box[3][0] = box3; box[4][0] = box4; box[5][0] = box5; box[6][0] = box6; box[7][0] = box7; box[8][0] = box8; box[0][1] = box9; box[1][1] = box10; box[2][1] = box11; box[3][1] = box12; box[4][1] = box13; box[5][1] = box14; box[6][1] = box15; box[7][1] = box16; box[8][1] = box17; box[0][2] = box18; box[1][2] = box19; box[2][2] = box20; box[3][2] = box21; box[4][2] = box22; box[5][2] = box23; box[6][2] = box24; box[7][2] = box25; box[8][2] = box26; box[0][3] = box27; box[1][3] = box28; box[2][3] = box29; box[3][3] = box30; box[4][3] = box31; box[5][3] = box32; box[6][3] = box33; box[7][3] = box34; box[8][3] = box35; box[0][4] = box36; box[1][4] = box37; box[2][4] = box38; box[3][4] = box39; box[4][4] = box40; box[5][4] = box41; box[6][4] = box42; box[7][4] = box43; box[8][4] = box44; box[0][5] = box45; box[1][5] = box46; box[2][5] = box47; box[3][5] = box48; box[4][5] = box49; box[5][5] = box50; box[6][5] = box51; box[7][5] = box52; box[8][5] = box53; box[0][6] = box54; box[1][6] = box55; box[2][6] = box56; box[3][6] = box57; box[4][6] = box58; box[5][6] = box59; box[6][6] = box60; box[7][6] = box61; box[8][6] = box62; box[0][7] = box63; box[1][7] = box64; box[2][7] = box65; box[3][7] = box66; box[4][7] = box67; box[5][7] = box68; box[6][7] = box69; box[7][7] = box70; box[8][7] = box71; box[0][8] = box72; box[1][8] = box73; box[2][8] = box74; box[3][8] = box75; box[4][8] = box76; box[5][8] = box77; box[6][8] = box78; box[7][8] = box79; box[8][8] = box80;
        //initialize entries of TextField array to make it easy to make calls to different boxes in the grid using BoxArray.py
        //row = box# % boardDim, col = (int) (box# / boardDim)

        for (int i = 0; i < boardDim; i++)
        {
            for (int j = 0; j < boardDim; j++)
            {
                box[i][j].setText(i + ", " + j);
            }
        }
    }

}
