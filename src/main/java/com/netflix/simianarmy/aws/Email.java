package com.netflix.simianarmy.aws;

import com.netflix.simianarmy.aws.AWSEmailNotifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Pattern;

public class Email {
    private String to;
    private String subject;
    private String body;

    private static final Logger LOGGER = LoggerFactory.getLogger(AWSEmailNotifier.class);
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+\\.#]+(.[_A-Za-z0-9-#]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private final Pattern emailPattern;


    public Email() {
        this.emailPattern = Pattern.compile(EMAIL_PATTERN);
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTo() {
        if (!isValidEmail(to)) {
            LOGGER.error(String.format("The destination email address %s is not valid, no email is sent.", to));
        }
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        if (!emailPattern.matcher(email).matches()) {
            LOGGER.error(String.format("Invalid email address: %s", email));
            return false;
        }
        if (email.equals("foo@bar.com")) {
            LOGGER.error(String.format("Email address not changed from default; treating as invalid: %s", email));
            return false;
        }
        return true;
    }
}
