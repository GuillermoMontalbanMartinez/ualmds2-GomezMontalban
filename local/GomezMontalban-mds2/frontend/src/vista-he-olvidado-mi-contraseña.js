import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-he-olvidado-mi-contraseña`
 *
 * VistaHeOlvidadoMiContraseña element.
 *
 * @customElement
 * @polymer
 */
class VistaHeOlvidadoMiContraseña extends PolymerElement {

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
        return 'vista-he-olvidado-mi-contraseña';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaHeOlvidadoMiContraseña.is, VistaHeOlvidadoMiContraseña);
