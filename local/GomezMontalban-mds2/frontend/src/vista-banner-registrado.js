import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-banner-registrado`
 *
 * VistaBannerRegistrado element.
 *
 * @customElement
 * @polymer
 */
class VistaBannerRegistrado extends PolymerElement {

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
        return 'vista-banner-registrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBannerRegistrado.is, VistaBannerRegistrado);
