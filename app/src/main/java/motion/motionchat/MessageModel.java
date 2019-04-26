package motion.motionchat;

public class MessageModel {
    public String chat;
    public Long date;
    public String name;

    public MessageModel(String chat, Long date, String name) {
        this.chat = chat;
        this.date = date;
        this.name = name;
    }

    public MessageModel() {
    }
}
