package com.dev.banking.service.impl;

import com.dev.banking.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailViaAttachment(EmailDetails emailDetails);
}
