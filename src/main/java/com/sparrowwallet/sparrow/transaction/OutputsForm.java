package com.sparrowwallet.sparrow.transaction;

import com.sparrowwallet.drongo.protocol.Transaction;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;

public class OutputsForm extends TransactionForm {
    private Transaction transaction;

    public OutputsForm(Transaction transaction) {
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public Node getContents() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("outputs.fxml"));
        Node node = loader.load();
        OutputsController controller = loader.getController();
        controller.setModel(this);
        return node;
    }

    public String toString() {
        return "Outputs";
    }
}