package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribesContent = new LinkedHashSet<>();
    private Set<Content> concludedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
    }

    public void progress(){
    }

    public void calculateTotalXp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribesContent() {
        return subscribesContent;
    }

    public void setSubscribesContent(Set<Content> subscribesContent) {
        this.subscribesContent = subscribesContent;
    }

    public Set<Content> getConcludedContent() {
        return concludedContent;
    }

    public void setConcludedContent(Set<Content> concludedContent) {
        this.concludedContent = concludedContent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subscribesContent == null) ? 0 : subscribesContent.hashCode());
        result = prime * result + ((concludedContent == null) ? 0 : concludedContent.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subscribesContent == null) {
            if (other.subscribesContent != null)
                return false;
        } else if (!subscribesContent.equals(other.subscribesContent))
            return false;
        if (concludedContent == null) {
            if (other.concludedContent != null)
                return false;
        } else if (!concludedContent.equals(other.concludedContent))
            return false;
        return true;
    }
    
}
