package com.bitpay.sdk.exceptions;

public class InvoiceException extends BitPayException {
    /**
     * Construct the InvoiceException.
     *
     * @param message String [optional] The Exception message to throw.
     */
    public InvoiceException(String message) {
        super(BuildMessage(message));
    }

    private static String BuildMessage(String message) {
        String BitPayMessage = "An unexpected error occurred while trying to manage the invoice";
        String BitPayCode = "BITPAY-INVOICE-GENERIC";

        if (message.isEmpty() || !message.contains("BITPAY-")) {
            message = BitPayCode + ": " + BitPayMessage + "-> " + message;
        }

        return message;
    }
}