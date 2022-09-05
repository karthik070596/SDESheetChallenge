package dto;

public abstract class ResponseDto {
    private ResponseStatus status;

    ResponseDto(ResponseStatus status) {
        this.status = status;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
