package Input;

import Coder.Coder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Message {
    private String message;
    private ArrayList<Integer> message_ints;
    private int[][] n_blocks_arr;
    private ArrayList<Integer> output_ints;
    private int nbamount;

    public Message() {
        this.message = this.readMessage();
        System.out.println(this.message);
        this.message_ints = Coder.toInt(this);
        this.output_ints = new ArrayList(this.message_ints.size());
    }

    public Message(int n, int razryad) {
        this.init_n_block(n, razryad);
    }

    public String getMessage() {
        return this.message;
    }

    public int getMessageLength() {
        return this.message.length();
    }

    public void init_n_block(int n, int razryadnost) {
        this.n_blocks_arr = new int[n][razryadnost];
    }

    public void put_to_n_block(int n, int r, int num) {
        this.n_blocks_arr[n][r] = num;
    }

    public int get_from_n_block(int i, int j) {
        return this.n_blocks_arr[i][j];
    }

    public int get_from_message_ints(int index) {
        return (Integer)this.message_ints.get(index);
    }

    public int getNbamount() {
        return this.nbamount;
    }

    public void setNbamount(int nbamount) {
        this.nbamount = nbamount;
    }

    public int[] get_one_block(int index) {
        return this.n_blocks_arr[index];
    }

    public String readMessage() {
        System.out.println("Введите сообщение");

        try {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            String s = reader1.readLine().toLowerCase();
            return s;
        } catch (IOException var3) {
            var3.printStackTrace();
            return "";
        }
    }
}