package controllers.api;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class CreateToken {
	public static void main(String[] args) {
		CreateToken ct = new CreateToken();
		@SuppressWarnings("static-access")
		String token = ct.createJWT("1", "user", "toKa", "tokenInfo", 600);
		System.out.println("Generate tokens --------------");
		System.out.println(token);
		System.out.println("Decode tokens --------------");
		ct.parseJWT(token);
	}

	// Sample method to construct a JWT
	// Generate Tokens
	/**
	 * @param id
	 * @param issuer
	 *            : who create the token
	 * @param subject
	 *            : token subject
	 * @param ttlMillis
	 *            : Expiration time
	 * @param autience
	 *            : noi dung token
	 * @return
	 */
	public static String createJWT(String id, String issuer, String subject, String autience, long ttlMillis) {

		// The JWT spignature algorithm we will be using to sign the token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);

		// We will sign our JWT with our ApiKey secret
		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("getSecret001");
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

		// Let's set the JWT Claims
		JwtBuilder builder = Jwts.builder().setId(id).setIssuedAt(now).setSubject(subject).setIssuer(issuer)
				.setAudience(autience).signWith(signatureAlgorithm, signingKey);

		// if it has been specified, let's add the expiration
		if (ttlMillis >= 0) {
			long expMillis = nowMillis + ttlMillis;
			Date exp = new Date(expMillis);
			builder.setExpiration(exp);
		}

		// Builds the JWT and serializes it to a compact, URL-safe string
		return builder.compact();
	}

	// Sample method to validate and read the JWT
	// Decode and Verify Tokens
	private void parseJWT(String jwt) {

		// This line will throw an exception if it is not a signed JWS (as
		// expected)
		try {
			Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary("getSecret001"))
					.parseClaimsJws(jwt).getBody();
			System.out.println("ID: " + claims.getId());
			System.out.println("Subject: " + claims.getSubject());
			System.out.println("Issuer: " + claims.getIssuer());
			System.out.println("Expiration: " + claims.getExpiration());
			System.out.println("Audience: " + claims.getAudience());
		} 
		catch (Exception e) {
			System.out.println("*** Get Token error");
			e.printStackTrace();
		}

	}
}
