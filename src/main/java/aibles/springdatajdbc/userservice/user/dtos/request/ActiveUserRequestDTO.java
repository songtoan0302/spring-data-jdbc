package aibles.springdatajdbc.userservice.user.dtos.request;

import aibles.springdatajdbc.userservice.validation.otp.OTPConstraint;

import javax.validation.constraints.NotBlank;

public class ActiveUserRequestDTO {

    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "OTP is required")
    @OTPConstraint
    private String otp;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
