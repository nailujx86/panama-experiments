// Generated by jextract

package net.nailuj.win;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef BOOL (*PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC)(DWORD, PCERT_PUBLIC_KEY_INFO, PCRYPT_ALGORITHM_IDENTIFIER, void *, LPCWSTR, LPCWSTR, BYTE *, DWORD, BYTE *, DWORD) __attribute__((stdcall))
 * }
 */
public class PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC {

    PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(int dwCertEncodingType, MemorySegment pPubKeyInfo, MemorySegment pSignatureAlgorithm, MemorySegment pvDecodedSignPara, MemorySegment pwszCNGPubKeyAlgid, MemorySegment pwszCNGHashAlgid, MemorySegment pbComputedHash, int cbComputedHash, MemorySegment pbSignature, int cbSignature);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        winapi.C_INT,
        winapi.C_LONG,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_LONG,
        winapi.C_POINTER,
        winapi.C_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = winapi.upcallHandle(PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,int dwCertEncodingType, MemorySegment pPubKeyInfo, MemorySegment pSignatureAlgorithm, MemorySegment pvDecodedSignPara, MemorySegment pwszCNGPubKeyAlgid, MemorySegment pwszCNGHashAlgid, MemorySegment pbComputedHash, int cbComputedHash, MemorySegment pbSignature, int cbSignature) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, dwCertEncodingType, pPubKeyInfo, pSignatureAlgorithm, pvDecodedSignPara, pwszCNGPubKeyAlgid, pwszCNGHashAlgid, pbComputedHash, cbComputedHash, pbSignature, cbSignature);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

