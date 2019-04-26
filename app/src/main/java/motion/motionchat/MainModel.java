package motion.motionchat;

public class MainModel {
    private String id;
    private String nama;
    private String chat;
    private Long date;

    public MainModel(String id, String nama, String chat, Long date) {
        this.id = id;
        this.nama = nama;
        this.chat = chat;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getChat() {
        return chat;
    }

    public Long getDate() {
        return date;
    }
}
