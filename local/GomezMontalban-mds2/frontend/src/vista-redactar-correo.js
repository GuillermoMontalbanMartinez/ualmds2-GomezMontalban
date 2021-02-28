import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-redactar-correo`
 *
 * VistaRedactarCorreo element.
 *
 * @customElement
 * @polymer
 */
class VistaRedactarCorreo extends PolymerElement {

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
        return 'vista-redactar-correo';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRedactarCorreo.is, VistaRedactarCorreo);
