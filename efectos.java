
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class efectos {
    
       private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void echo() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You said:'" + text + "'"));
    }
    
}
