import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-he-olvidado-mi-contraseņa`
 *
 * VistaHeOlvidadoMiContraseņa element.
 *
 * @customElement
 * @polymer
 */
class VistaHeOlvidadoMiContraseņa extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-he-olvidado-mi-contraseņa';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaHeOlvidadoMiContraseņa.is, VistaHeOlvidadoMiContraseņa);
