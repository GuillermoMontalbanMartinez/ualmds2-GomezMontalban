import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-correo-usuario`
 *
 * VistaCorreoUsuario element.
 *
 * @customElement
 * @polymer
 */
class VistaCorreoUsuario extends PolymerElement {

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
        return 'vista-correo-usuario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCorreoUsuario.is, VistaCorreoUsuario);
